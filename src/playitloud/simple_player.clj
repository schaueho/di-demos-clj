(ns playitloud.simple-player
  (:require [playitloud.speaker :as speaker :refer [blare]]
            [playitloud.musiccoll :as mc :refer [get-songs]]))

(defn simply-play [randomize]
  (let [songs (get-songs)
        songs (if randomize (shuffle songs) songs)]
    (map (fn [song]
           (blare song))
         songs)))
  
             
