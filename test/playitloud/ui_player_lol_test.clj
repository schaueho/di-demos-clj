(ns playitloud.ui-player-lol-test
  (:require [midje.sweet :refer :all]
            [playitloud.ui-player-lol :refer :all]))

(fact "Press play"
      (lol-config-play-pressed :headphone false)
      => (just ["Headphone plays David Bowie -- Blackstar"
                "Headphone plays David Bowie -- Lazarus"
                "Headphone plays Ideal -- Eiszeit"]))
