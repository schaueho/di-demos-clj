(ns playitloud.output-sig
  (:require [de.find-method.funsig :refer [defsig]]))

(defsig blare "Play sound loudly!" [sound])
