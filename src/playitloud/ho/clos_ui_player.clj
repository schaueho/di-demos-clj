; -----------------------------------------------------------
(ns playitloud.ho.clos-ui-player
  (:require [playitloud.ho.play-config :refer [select-playfn]]))

(defn play-pressed [output randomize]
  (let [playfn (select-playfn output)]
    (playfn randomize)))
