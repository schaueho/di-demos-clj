(ns playitloud.multi-player-test
  (:require [playitloud.multi-player :refer :all]
            [playitloud.output-multi :refer [blare]]
            [playitloud.speaker-multi :as speaker] ; just to load the code once
            [midje.sweet :refer :all]))

(defmethod blare :test [device sound]
  (println "Blaring sound " sound)
  (str "Test: " sound))


(facts "We can play over whatever player we want"
       (fact "Playing on the speaker player"
             (multi-play :speaker false)
             => (just ["Speaker plays David Bowie -- Blackstar"
                       "Speaker plays David Bowie -- Lazarus"
                       "Speaker plays Ideal -- Eiszeit"]))
       (fact "Playing on the test output device"
             (multi-play :test false)
             => (just ["Test: David Bowie -- Blackstar"
                       "Test: David Bowie -- Lazarus"
                       "Test: Ideal -- Eiszeit"])))

