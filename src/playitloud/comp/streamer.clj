(ns playitloud.comp.streamer
  (:require [com.stuartsierra.component :as component]
            [playitloud.output-device :as output :refer :all]
            [playitloud.comp.remote-connection :as remote :refer 
             [connect disconnect transmit send-command]]))

(defrecord BlueStreamer [connection volume]
    OutputDevice
  (blare [streamer sound]
    (let [result (str "Will stream " sound " to device " (:connection streamer))]
      (println result)
      (transmit (:connection streamer) sound)          
      result))
  (inc-volume [streamer]
    (send-command (:connection streamer) :inc-volume))
  (dec-volume [streamer]
    (send-command (:connection streamer) :dec-volume))

  component/Lifecycle
  (start [streamer]
    (let [connection (connect (:connection streamer) streamer)]
      (assoc streamer :connection connection)))
  (stop [streamer]
    (->> (disconnect (:connection streamer) streamer)
         (assoc streamer :connection))))

(defn new-blue-streamer [config]
  (->BlueStreamer (:connection config) 
                  (:default-volume config)))
