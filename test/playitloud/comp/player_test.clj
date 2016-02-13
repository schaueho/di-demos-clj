(ns playitloud.comp.player-test
  (:require [midje.sweet :refer :all]
            [com.stuartsierra.component :as component]
            [playitloud.comp.config :refer [make-player-system]]
            [playitloud.comp.player :refer :all]
            [playitloud.comp.output-device :as output :refer :all]
            [playitloud.comp.streamer :refer :all]
            [playitloud.comp.blue-connection :refer :all]))

(def test-output-device
  (let [volume 1]
    (reify OutputDevice
      (blare [_ sound]
        (println "Blaring sound " sound)
        (str "Test: " sound))
      (inc-volume [_]
        (inc volume))
      (dec-volume [_]
        (dec volume)))))

(facts "Player with deps injected via component"
       (let [player-system (make-player-system)
             player-system (component/start player-system)
             player (:player player-system)]
         (fact "Default player will be the blue-stream player"
               (:output-device player) =not=> nil
               (type (:output-device player))
               => playitloud.comp.streamer.BlueStreamer)
               ;; (type (get-in player [:output-device :connection]))
               ;; => BlauZahnConnection)
         (fact "We can play on the default player"
               (play player false)
               => (just [(has-prefix "Will stream David Bowie -- Blackstar to device playitloud.comp.blue_connection.BlauZahnConnection")
                         (has-prefix "Will stream David Bowie -- Lazarus to device playitloud.comp.blue_connection.BlauZahnConnection@")
                         (has-prefix "Will stream Ideal -- Eiszeit to device playitloud.comp.blue_connection.BlauZahnConnection@")]))
         (fact "Playing on test-device by assoc new output-device"
               (play (assoc player :output-device test-output-device) false)
               => (just ["Test: David Bowie -- Blackstar"
                         "Test: David Bowie -- Lazarus"
                         "Test: Ideal -- Eiszeit"]))))
