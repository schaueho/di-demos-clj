(ns playitloud.di.player-test
  (:require [midje.sweet :refer :all]
            [clj-di.test :refer [with-registered]]
            [playitloud.headphone]
            [playitloud.di.config]
            [playitloud.di.player :refer :all]))

(facts "Play via clj-di"
       (fact "Just use the configured output device speaker"
             (play false)
             => (just ["Speaker plays David Bowie -- Blackstar"
                       "Speaker plays David Bowie -- Lazarus"
                       "Speaker plays Ideal -- Eiszeit"]))
       (fact "We can also use a different config for testing"
             (with-registered [:blare playitloud.headphone/blare]
               (play false)
               => (just ["Headphone plays David Bowie -- Blackstar"
                         "Headphone plays David Bowie -- Lazarus"
                         "Headphone plays Ideal -- Eiszeit"]))))
