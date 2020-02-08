(ns human-readable.time-spec
  (:require [speclj.core :refer :all]
            [human-readable.time :refer :all]))

(describe "human-readable"
          (it "transfers seconds to human readable"
              (should= (human-readable 0) "00:00:00")
              (should= (human-readable 60) "00:01:00")
              (should= (human-readable 90) "00:01:30")
              (should= (human-readable 86399) "23:59:59")
              (should= (human-readable 359999) "99:59:59"))
)(run-specs)


; (ns HumanTimeTest
;   (:require [clojure.test :refer :all]
;             [HumanTime :refer [human-readable]]))

; (deftest Tests
;   (is (= (human-readable      0)))
;   (is (= (human-readable     59) "00:00:59"))
;   (is (= (human-readable     60) "00:01:00"))
;   (is (= (human-readable     90) "00:01:30"))
;   (is (= (human-readable  86399) "23:59:59"))
;   (is (= (human-readable 359999) "99:59:59")))