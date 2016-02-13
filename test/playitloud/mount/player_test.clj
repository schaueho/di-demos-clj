(ns playitloud.mount.player-test
  (:require [midje.sweet :refer :all]
            [mount.core :as mount :refer [defstate]]
            [playitloud.mount.player :refer [player play]]))


(defn make-test-streamer [] {:connection {:name "Test connection"}})

(facts "Handling state with mount"
       (with-state-changes [(before :facts (mount/start))
                            (after :facts (mount/stop))]
         (fact "We can play over the configured device"
               (play false)
               => (just ["Will stream David Bowie -- Blackstar to device {:name \"Mount connection\"}"
                         "Will stream David Bowie -- Lazarus to device {:name \"Mount connection\"}"

                         "Will stream Ideal -- Eiszeit to device {:name \"Mount connection\"}"])))

       (with-state-changes [(before :facts
                                    (mount/start-with {#'playitloud.mount.connection/conn {:name "Test connection"}
                                                       #'playitloud.mount.streamer/streamer (make-test-streamer)}))

                            (after :facts (mount/stop))]
         (fact "We can start without the dependency and use a different connection"
               (play false)
               => (just ["Will stream David Bowie -- Blackstar to device {:name \"Test connection\"}"
                         "Will stream David Bowie -- Lazarus to device {:name \"Test connection\"}"
                         "Will stream Ideal -- Eiszeit to device {:name \"Test connection\"}"]))))

