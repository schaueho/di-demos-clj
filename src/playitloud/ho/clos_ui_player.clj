; -----------------------------------------------------------
(ns playitloud.ho.clos-ui-player
  (:require [playitloud.ho.play-config :refer [select-playfn]]
            [playitloud.musiccoll :refer [get-songs]]))

(defn play-pressed [speaker randomize]
  (let [playfn (select-playfn speaker)]
    (playfn randomize)))
