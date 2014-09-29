/*
 * Copyright (C) 2014 Jörg Prante
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.xbib.io.compress.lzf;

import org.xbib.io.compress.CompressCodec;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LZFCompressCodec implements CompressCodec<LZFInputStream, LZFOutputStream> {

    @Override
    public String getName() {
        return "lzf";
    }

    @Override
    public LZFInputStream decode(InputStream in) throws IOException {
        return new LZFInputStream(in);
    }

    @Override
    public LZFInputStream decode(InputStream in, int bufsize) throws IOException {
        return new LZFInputStream(in, true);
    }

    @Override
    public LZFOutputStream encode(OutputStream out) throws IOException {
        return new LZFOutputStream(out);
    }

    @Override
    public LZFOutputStream encode(OutputStream out, int bufsize) throws IOException {
        return new LZFOutputStream(out, bufsize);
    }
}
