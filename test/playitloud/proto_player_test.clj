(ns playitloud.proto-player-test
  (:require [playitloud.proto-player :refer :all]
            [midje.sweet :refer :all]
            [playitloud.output-device :as output :refer :all]))

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

(fact "We can play over whatever player we want"
      (proto-play test-output-device false)
      => (just ["Test: David Bowie -- Blackstar"
                "Test: David Bowie -- Lazarus"
                "Test: Ideal -- Eiszeit"]))
