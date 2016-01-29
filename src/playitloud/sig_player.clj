(ns playitloud.sig-player
  (:require [playitloud.output-sig :refer [blare]]
            [playitloud.musiccoll :as mc :refer [get-songs]]))

(defn sig-play [randomize]
  (let [songs (get-songs)
        songs (if randomize (shuffle songs) songs)]
    (map (fn [song]
           (blare song))
         songs)))
  
             
