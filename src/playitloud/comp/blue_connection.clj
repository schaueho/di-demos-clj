(ns playitloud.comp.blue-connection
  (:require [playitloud.comp.remote-connection
             :refer [RemoteDataConnectionProtocol]]))

(defrecord BlauZahnConnection [options]
  RemoteDataConnectionProtocol
  
  (connect [connection source]
    (let [options (:options connection)]
      (println "Connecting to " (:name options))
      (assoc connection :options options)
      (assoc connection :status :connected)))

  (disconnect [connection source]
    (println "Disconnecting from "
             (get-in connection [:options :name]))
    (assoc connection :status :disconnected))

  (transmit [connection data]
    (println (str "Transmitting data " data)))

  (send-command [connection command]
    (println (str "Sending command " command))))

(defn new-connection [config]
  (->BlauZahnConnection (:bt-conn config)))
