(ns playitloud.sig-player-test
  (:require [playitloud.sig-player :refer [sig-play]]
            [playitloud.output-sig :as output]
            [playitloud.speaker-sig :as speaker]
            [playitloud.headphone-sig :as headphone]
            [de.find-method.funsig :refer [set-default-implementation!]]
            [midje.sweet :refer :all]))

(facts "Playing with various output devices"
       (fact "Playing on the headphone"
             (sig-play false)
             => (just ["Headphone plays David Bowie -- Blackstar"
                       "Headphone plays David Bowie -- Lazarus"
                       "Headphone plays Ideal -- Eiszeit"]))
       (set-default-implementation! output/blare speaker/blare-impl)
       (fact "Playing on the speaker"
             (sig-play false)
             => (just ["Speaker plays David Bowie -- Blackstar"
                       "Speaker plays David Bowie -- Lazarus"
                       "Speaker plays Ideal -- Eiszeit"])))
      

