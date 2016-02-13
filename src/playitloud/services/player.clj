(ns playitloud.services.player
  (:require [playitloud.services.config :refer [*services*]]))

(defn- blare [sound]
  ((:blare *services*) sound))

(defn- get-songs []
  ((:get-songs *services*)))

(defn play [randomize]
  (let [songs (get-songs)
        songs (if randomize (shuffle songs) songs)]
    (map (fn [song]
           (blare song))
         songs)))



