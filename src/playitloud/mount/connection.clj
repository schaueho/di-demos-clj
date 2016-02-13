(ns playitloud.mount.connection
  (:require [mount.core :refer [defstate]]
            [playitloud.mount.config :refer [default-configuration]]))

(defn create-conn [config]
  (:bt-conn config))

(defstate conn :start (create-conn default-configuration))

(defn connect [connection source]
  (println "Connecting to " (get-in connection [:options :name]))
  (assoc connection :options connection)
  (assoc connection :status :connected))

(defn disconnect [connection source]
  (println "Disconnecting from " (get-in connection [:options :name]))
  (assoc connection :status :disconnected))

(defn transmit [connection data]
  (println (str "Transmitting data " data)))

(defn send-command [connection command]
  (println (str "Sending command " command)))
