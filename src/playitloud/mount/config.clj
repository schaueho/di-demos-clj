(ns playitloud.mount.config
  (:require [mount.core :refer [defstate]]))

(defn- load-default-config []
  {:bt-conn {:name "Mount connection"}})

(defstate default-configuration :start (load-default-config))
