/*
 * (c) Copyright 2017 Palantir Technologies Inc. All rights reserved.
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

package com.palantir.conjure.java.config.ssl.pkcs1;

import com.google.common.io.BaseEncoding;
import java.math.BigInteger;

final class TestConstants {

    private static final String RSA_KEY_STRING = "MIIEpAIBAAKCAQEAw3DDCofFqhKebqaVBByOQ4XREWXEmmc+FyPeokgNgDFM9f3pstuXn"
            + "5FXsKWocvp80tQbDCZuI3MwzSY8ZHAq4QffrxqHN/RM03mK6aKLY1j2Yf6TfRH/4dmnUtbIwmsPgRe07JbmQ6NjAJKBmvyzo+RBNIvsd"
            + "1W3TFdo1Tv4qgjVi2rvAHAaX6zy0LUsRVv8JUNESdS3sMkHCp8Bq/e9U+kB94XtYM60Z15gzRWHuLdP4sFRE85orGGzXSrOpCvfSsLQ7"
            + "iu4LMjA+UizJlaLZJgijCIsP3Vht52pEQck6mwjXW9Q4HrEFdC1L4P479DwhD6tbU57IlLMvP4o4QV4vQIDAQABAoIBAQCm8K7pU8g32"
            + "eeSxKAM/wdWDfvjTHZ/HSkgQvdszvcZRQNkLBtvN7twBYpNzXLxo5zzyVHBMyJpDX/l/H8hm95EkaEzxQkzdm4ZRXyuzLUbi2YJlpcNA"
            + "k778BrI28Zoq2J29nUIkmzl4a4zUvF6Hdikadh4tfyqgoErqI5Xdf6V3a69WpoAJEFJU+xvhc/NlqKUCV8PuqPyOUQbWiYMEP9F3JUZu"
            + "6rAKZDlwx4ycWoKgW0I4YSigHMT1H8DCm0zNPJ3e8yTZv8kysuvcson5wkot1AQsty7/Fg8XIawB4uiW5H+4jemhB6WRGe1JDWpuyjMG"
            + "Vk6uibd5/XYWq4+98vRAoGBAPDdRqvYrBH22VUoD/3tAIs3qCLGvvI/cVJl/tC9gT0CoaqTsMh9o9dyWWiuhrG2EV977FR2pZEIhaTVo"
            + "X3ImhQ+qU16D0L2E5kGs7Jcv1e3LLBWCRaUIVPazV39SY5Jd2RRdjPfxDVfDWORzGYXzO3ub1LgWcBHcg4BedBoEXXrAoGBAM+4w2hnc"
            + "vSAEg65xlkUHa+McBM4hJ+vAA6L8G7N1XpEmlHa6V+DyksiZwQOm+BKe/qPxtJXJnBXrKFYWqa2ytIbKYAqI6dDIzM0kbQAqcN+AQlcL"
            + "/YxjUoh3QduCgiB759x4NPwsK49JHW8d3uond93rD6sQcBS+MztA22hCln3AoGBAMUYjMf6WXOpx1YDnnJvCc7iEFfEwmOAvr5qcAVnz"
            + "OWbzabDjBnDldqq27bpeZbaIYU85rqHDByOGK41khxXlp2SWP/pLavhqU/DSDBf7MNeRNdWz8EGHe98UCjlJtekDmqsrkjshqYVzeL4X"
            + "4X7W9onDjmHFGpfDFmho4iCYCdZAoGAD4VtzIJWW6CqOMF26bcQFMr4oOcLOedYqL2aJJ1qwy0XHuCtqX5ugji629m/mf3Wz70ojRUIA"
            + "UL72j6A344vD44KBtKfQWNJ4QyfioS2Kq5io3FpAAtp1E09d82oIESdRBu9QfjtKsfUzptbjjjmOwl1LGWwsA9DGgTnyaxL2rcCgYAUP"
            + "kEPNCzqEVJnjVilqUs2UxPrP7asgW+TKqCM9TbHbLvuNxMyubP6a7GxlrB/2oIR+wW/GFE522NSvWZstPhxT4fSrRGdeHq0bx6Q59db8"
            + "/2HB4MQ1/wjKI65gk2LT6ZDCFJn3p11iqPTn4TZrAmTnz74Cy7BRb0ZAXDnxy0liw==";
    static final byte[] PRIVATE_KEY_DER = BaseEncoding.base64().decode(RSA_KEY_STRING);

    static final BigInteger MODULUS = new BigInteger("24672074423553690872088806506143334113520488772700746396456930744"
            + "73290765482349636378658891087811519189057427134952180935901523289561211017134439526367838170409899153940"
            + "26342813790366159674313953582554261269872881351635312330617996887375846310722675778312698899754058299747"
            + "69789902431696272166681426614850238103392946213349438551140196096315604231448530497913753444061679922648"
            + "95775866928577251775033616614725255411781540424649872738255070870091019846839457458336167131295080272607"
            + "19274153682620004871715116527730250345505518889523996953596738448951712961898554250913728424854600724355"
            + "96937939590204229376347851815101", 10);

    static final BigInteger PRIVATE_EXPONENT = new BigInteger("21074243957314732365221651711459234381721423951291450375"
            + "72148531501515434818528962944250190321431997866906247936503396383596552691603774856023100304958597140234"
            + "46533465944347021010798443910586311878044273401093792789791183366159504795082165440503156843766801721290"
            + "75459083992444554040104937911268844498517117222237770964309778908956322661892275570053536775276960670486"
            + "01274999478447809152137511235718013697678193027962934178242860845181922360332019568055526321039049961248"
            + "76718033796744915561248742011679284609107207243507370062983896261255054214388348309684926003840116764584"
            + "66964468281893086051962169614195259591633", 10);

    private TestConstants() {}
}
