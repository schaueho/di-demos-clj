(ns playitloud.musiccoll)

(def musiccoll (atom ["David Bowie -- Blackstar" "David Bowie -- Lazarus" "Ideal -- Eiszeit"]))

(defn get-songs []
  @musiccoll)

(defn add-song [song]
  (swap! musiccoll conj song))
