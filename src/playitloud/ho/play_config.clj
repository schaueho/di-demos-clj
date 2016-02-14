; -----------------------------------------------------------
(ns playitloud.ho.play-config
  (:require [playitloud.ho.player :as ho :refer [make-playfn]]
            [playitloud.speaker :as speaker]
            [playitloud.headphone :as headphone]
            [playitloud.blue-streamer :as streamer]
            [playitloud.musiccoll :refer [get-songs]]))
        
(def speaker-play   (make-playfn speaker/blare get-songs))
(def headphone-play (make-playfn headphone/blare get-songs))
(def stream-play    (make-playfn streamer/blare get-songs))

(defn select-playfn [speaker]
  (condp = speaker
    :speaker   speaker-play
    :headphone headphone-play
    :stream    stream-play))


