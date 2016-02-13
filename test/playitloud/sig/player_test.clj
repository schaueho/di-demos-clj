(ns playitloud.sig.player-test
  (:require [playitloud.sig.player :refer [play]]
            [playitloud.sig.output-device :as output]
            [playitloud.sig.speaker :as speaker]
            [playitloud.sig.headphone :as headphone]
            [de.find-method.funsig :refer [set-default-implementation!]]
            [midje.sweet :refer :all]))

(facts "Playing with various output devices"
       (fact "Playing on the headphone"
             (play false)
             => (just ["Headphone plays David Bowie -- Blackstar"
                       "Headphone plays David Bowie -- Lazarus"
                       "Headphone plays Ideal -- Eiszeit"]))
       (set-default-implementation! output/blare speaker/blare-impl)
       (fact "Playing on the speaker"
             (play false)
             => (just ["Speaker plays David Bowie -- Blackstar"
                       "Speaker plays David Bowie -- Lazarus"
                       "Speaker plays Ideal -- Eiszeit"])))

