/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.appium.uiautomator2.model.settings;

public class SnapshotMaxDepth extends AbstractSetting<Integer> {
    public static final String SETTING_NAME = "snapshotMaxDepth";
    // https://github.com/appium/appium/issues/12892
    private static final Integer DEFAULT_VALUE = 70;
    private Integer snapshotMaxDepth = DEFAULT_VALUE;

    public SnapshotMaxDepth() {
        super(Integer.class, SETTING_NAME);
    }

    @Override
    public Integer getValue() {
        return snapshotMaxDepth;
    }

    @Override
    public Integer getDefaultValue() {
        return DEFAULT_VALUE;
    }

    @Override
    protected void apply(Integer value) {
        snapshotMaxDepth = value;
    }
}
