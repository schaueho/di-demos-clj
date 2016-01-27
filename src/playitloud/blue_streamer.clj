(ns playitloud.blue-streamer)
;  (:require [some.bluetooth.lib :as bt]))

(defn blare [noise connection]
  (let [result (str "Streaming " noise " to device " connection)]
    (println result)
;    (bt/stream connection noise)
    result))
