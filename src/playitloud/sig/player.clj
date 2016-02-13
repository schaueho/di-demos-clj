(ns playitloud.sig.player
  (:require [playitloud.sig.output-device :refer [blare]]
            [playitloud.musiccoll :as mc :refer [get-songs]]))

(defn play [randomize]
  (let [songs (get-songs)
        songs (if randomize (shuffle songs) songs)]
    (map (fn [song]
           (blare song))
         songs)))
  
             
