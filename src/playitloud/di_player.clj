(ns playitloud.di-player
  (:require [clj-di.core :refer [get-dep]]))

(defn di-play [randomize]
  (let [blarefn (get-deps :blare) ; <-- get dependency
        songs (get-songs)
        songs (if randomize (shuffle songs) songs)]
    (map (fn [song]
           (blarefn song))
         songs)))
