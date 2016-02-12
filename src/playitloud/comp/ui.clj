(ns playitloud.comp.ui
  (:require [playitloud.comp.player :as player :refer [play]]))

(defrecord UIcomponent [player])

(defn play-pressed [uicomp randomize]
  (println "User pressed play")
  (play (:player uicomp) randomize))

