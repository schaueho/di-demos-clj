; ---------------------------------------------------
(ns playitloud.ho.player)

(defn play [blarefn songgetterfn randomize]
  (let [songs (songgetterfn)
        songs (if randomize (shuffle songs) songs)]
    (map (fn [song]
           (blarefn song))
         songs)))

(defn make-playfn
  "Returns a function that will play all songs"
  [blarefn songgetterfn]
  
  (fn ; Plays all songs, potentially randomized
    [randomize]
    (let [songs (songgetterfn)
          songs (if randomize (shuffle songs) songs)]
      (map (fn [song]
             (blarefn song))
           songs))))

