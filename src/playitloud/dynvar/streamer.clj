(ns playitloud.dynvar.streamer
  (:require [playitloud.dynvar.config :as config]
            [playitloud.dynvar.connection :refer [transmit]]))

(defn blare [noise]
  (let [result (str "Streaming " noise " to device " config/*connection*)]
    (println result)
    (transmit (:connection config/*streamer* noise)
    result)))
