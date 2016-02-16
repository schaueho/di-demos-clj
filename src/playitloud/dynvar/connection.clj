(ns playitloud.dynvar.connection
  (:require [playitloud.dynvar.config :as config]))

(defn transmit [data]
  (println config/*connection* " transmitting data " data))

(defn connect [source]
  (println "Connecting " config/*connection* " to " source)
  {:connection config/*connection*
   :source source
   :status :connected})
