(ns playitloud.multi.player-test
  (:require [playitloud.multi.player :refer :all]
            [playitloud.multi.output-device :refer [blare]]
            [playitloud.multi.speaker :as speaker] ; just to load the code once
            [midje.sweet :refer :all]))

(defmethod blare :test [device sound]
  (println "Blaring sound " sound)
  (str "Test: " sound))


(facts "We can play over whatever player we want"
       (fact "Playing on the speaker player"
             (play :speaker false)
             => (just ["Speaker plays David Bowie -- Blackstar"
                       "Speaker plays David Bowie -- Lazarus"
                       "Speaker plays Ideal -- Eiszeit"]))
       (fact "Playing on the test output device"
             (play :test false)
             => (just ["Test: David Bowie -- Blackstar"
                       "Test: David Bowie -- Lazarus"
                       "Test: Ideal -- Eiszeit"])))

