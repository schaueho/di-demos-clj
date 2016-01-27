(ns playitloud.simple-player-test
  (:require [midje.sweet :refer :all]
            [playitloud.simple-player :refer [simply-play]]))


(fact "Playing a simple player will blare over speaker"
      (simply-play false) => (just ["Speaker plays David Bowie -- Blackstar"
                                    "Speaker plays David Bowie -- Lazarus"
                                    "Speaker plays Ideal -- Eiszeit"]))
