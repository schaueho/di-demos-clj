; -----------------------------------------------------------
(ns playitloud.ui-player
  (:require [playitloud.simple-player :refer [play]]))

(defn play-pressed [randomize]
  (println "User pressed play")
  (play randomize))
