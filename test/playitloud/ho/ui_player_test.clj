(ns playitloud.ho.ui-player-test
  (:require [midje.sweet :refer :all]
            [playitloud.ho.clos-ui-player :refer :all]))

(fact "Press play"
      (play-pressed :headphone false)
      => (just ["Headphone plays David Bowie -- Blackstar"
                "Headphone plays David Bowie -- Lazarus"
                "Headphone plays Ideal -- Eiszeit"]))
