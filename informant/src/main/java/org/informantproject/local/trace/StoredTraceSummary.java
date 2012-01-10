/**
 * Copyright 2011-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.informantproject.local.trace;

import com.google.common.base.Objects;

/**
 * Structure used in the response to "/traceSummaries".
 * 
 * @author Trask Stalnaker
 * @since 0.5
 */
public class StoredTraceSummary {

    private long capturedAt;
    private double duration;

    public StoredTraceSummary() {}

    public StoredTraceSummary(long capturedAt, double duration) {
        this.capturedAt = capturedAt;
        this.duration = duration;
    }

    public long getCapturedAt() {
        return capturedAt;
    }

    public void setCapturedAt(long capturedAt) {
        this.capturedAt = capturedAt;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof StoredTraceSummary)) {
            return false;
        }
        StoredTraceSummary other = (StoredTraceSummary) o;
        return Objects.equal(capturedAt, other.getCapturedAt())
                && Objects.equal(duration, other.getDuration());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(capturedAt, duration);
    }
}
