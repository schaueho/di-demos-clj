(ns playitloud.services-player
  (:require [playitloud.services :refer [*services*])))

(defn- blare [sound]
  ((:blare *services*) sound))

(defn service-play [randomize]
  (let [songs (get-songs)
        songs (if randomize (shuffle songs) songs)]
    (map (fn [song]
           (blare song))
         songs)))



