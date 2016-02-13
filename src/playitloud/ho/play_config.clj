; -----------------------------------------------------------
(ns playitloud.ho.play-config
  (:require [playitloud.ho.player :as ho :refer [clos-play]]
            [playitloud.speaker :as speaker]
            [playitloud.headphone :as headphone]
            [playitloud.blue-streamer :as streamer]
            [playitloud.musiccoll :refer [get-songs]]))
        
(def speaker-play   (clos-play speaker/blare get-songs))
(def headphone-play (clos-play headphone/blare get-songs))
(def stream-play    (clos-play streamer/blare get-songs))

(defn select-playfn [speaker]
  (condp = speaker
    :speaker   speaker-play
    :headphone headphone-play
    :stream    stream-play))


