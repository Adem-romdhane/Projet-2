package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface ISymptomCountingOccurrency {
    Map<String, Integer> countingOccurrency(List<String> symptoms);
}
