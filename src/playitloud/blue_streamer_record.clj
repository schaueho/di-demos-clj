(ns playitloud.blue-streamer-record
  (:require [playitloud.output-device :as output :refer :all]))

(defn- stream [connection sound]
  (println (str "Streaming sound " sound)))

(defn- send-command [connection command]
  (println (str "Sending command " command)))

(defrecord BlueStreamer [volume connection]
    OutputDevice
  (blare [streamer sound]
    (let [result (str "Will stream " sound " to device " (connection streamer))]
      (println result)
      (stream connection sound)          
      result))
  (inc-volume [_]
    (send-command connection :inc-volume))
  (dec-volume [_]
    (send-command connection :dec-volume)))
