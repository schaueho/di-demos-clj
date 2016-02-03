(ns playitloud.di-player
  (:require [clj-di.core :refer [get-dep]]
  	    [playitloud.musiccoll :refer [get-songs]]))

(defn di-play [randomize]
  (let [blarefn (get-dep :blare) ; <-- get dependency
        songs (get-songs)
        songs (if randomize (shuffle songs) songs)]
    (map (fn [song]
           (blarefn song))
         songs)))
