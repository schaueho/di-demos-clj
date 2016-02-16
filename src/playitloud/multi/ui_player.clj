(ns playitloud.multi.ui-player
  (:require [playitloud.multi.player :as player :refer [play]]))

(defn play-pressed [output-selection randomize]
  (println "User pressed play")
  (play output-selection randomize))

