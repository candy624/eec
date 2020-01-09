/*
 * Copyright (c) 2017-2019, guanquan.wang@yandex.com All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
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

package org.ttzero.excel.reader;

import org.junit.Test;
import org.ttzero.excel.Print;

import java.io.IOException;

import static org.ttzero.excel.reader.ExcelReaderTest.testResourceRoot;

/**
 * @author guanquan.wang at 2019-06-12 17:26
 */
public class MultiStyleInCellTest {
    @Test public void testMulti() {
        try (ExcelReader reader = ExcelReader.read(testResourceRoot().resolve("multi-style In cell.xlsx"))) {

            reader.sheet(0).rows().forEach(Print::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
