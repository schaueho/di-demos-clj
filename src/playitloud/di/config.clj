(ns playitloud.di.config
  (:require [clj-di.core :refer [register!]]
            [playitloud.speaker :as speaker :refer [blare]]))

(register! :blare blare)
