(ns playitloud.services.player-test
  (:require [playitloud.services.player :refer :all]
            [midje.sweet :refer :all]))

(facts "Play with service lookup"
       (fact "Just use the configured output device speaker"
             (play false)
             => (just ["Speaker plays David Bowie -- Blackstar"
                       "Speaker plays David Bowie -- Lazarus"
                       "Speaker plays Ideal -- Eiszeit"])))
