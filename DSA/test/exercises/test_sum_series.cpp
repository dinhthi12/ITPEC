#include <gtest/gtest.h>
#include "exercises/sum_series.h"

TEST(SumSeriesTest, PositiveInput) {
    EXPECT_NEAR(sumSeries(1), 1.0f, 1e-6);
    EXPECT_NEAR(sumSeries(2), 1.5f, 1e-6);
    EXPECT_NEAR(sumSeries(3), 1.833333f, 1e-6);
    EXPECT_NEAR(sumSeries(10), 2.928968f, 1e-6);
}

TEST(SumSeriesTest, ZeroOrNegative) {
    EXPECT_FLOAT_EQ(sumSeries(0), 0.0f);
    EXPECT_FLOAT_EQ(sumSeries(-5), 0.0f);
}
