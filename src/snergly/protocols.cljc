(ns snergly.protocols)

;; This is not well encapsulated ... maze-params is the structure from the
;; UI application state, and I don't think it's good to have the animation
;; code tied to that.
(defprotocol Animator
  (start-animation [_ maze-params ui])
  (animate-frame [_ grid cell-size canvas]))

(defprotocol UI
  (report-status [_ msg])
  (report-grid [_ grid]));; ensure that the grid gets wrapped in an atom