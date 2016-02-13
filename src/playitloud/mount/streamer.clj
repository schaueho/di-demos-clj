(ns playitloud.mount.streamer
  (:require [mount.core :refer [defstate]]
            [playitloud.mount.connection :refer [conn transmit send-command]]))

(defn create-streamer [connection]
   {:connection connection})

(defstate streamer :start (create-streamer conn))

(defn blare [streamer sound]
  (let [result (str "Will stream " sound " to device " (:connection streamer))]
    (println result)
    (transmit conn sound)
    result))

(defn inc-volume [streamer]
  (send-command conn :inc-volume))

(defn dec-volume [streamer]
  (send-command conn :dec-volume))
