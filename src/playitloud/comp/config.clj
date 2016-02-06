(ns playitloud.comp.config
  (:require [com.stuartsierra.component :as component]
            [playitloud.comp.blue-connection :as blueconn]
            [playitloud.comp.streamer :as streamer]
            [playitloud.comp.player :as player]))

(def blue-connection-options
  {:name "Fabuluous-Connectivity"
   :port "1234"
   :color "blue"})

(def default-config
  {:bt-conn blue-connection-options
   :default-volume 5})

(defn make-player-system
  "Setup the player system"
  ([]
   (make-player-system default-config))
  ([config]
   (component/system-map
    :connection (blueconn/new-connection config)
    :output-device (component/using
                    (streamer/new-blue-streamer config)
                    [:connection])
    :player (component/using
             (player/new-player)
             [:output-device]))))
