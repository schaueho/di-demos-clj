; -----------------------------------------------------------
(ns playitloud.closure-streamer)

(defn- transmit [connection data]
  (println (str "Transmitting data " data)))

(defn- connect [options source]
  (println "Connecting to " (:name options))
  {:options options
   :status :connected})

(defn blare [connection-config]
  (let [connection (connect connection-config " closure streamer")]
    (fn [noise]
      (let [result (str "Streaming " noise " to device " connection)]  
        (println result)
        (transmit connection noise)
        result))))
