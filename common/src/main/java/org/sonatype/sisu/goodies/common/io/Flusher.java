/*
 * Copyright (c) 2007-2014 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package org.sonatype.sisu.goodies.common.io;

import java.io.Flushable;
import java.io.IOException;

import org.sonatype.sisu.goodies.common.Loggers;
import org.sonatype.sisu.goodies.common.UnhandledThrowable;

import org.slf4j.Logger;

/**
 * Quietly flushes {@link Flushable} objects.
 *
 * @since 1.0
 */
public final class Flusher
{
  private static final Logger log = Loggers.getLogger(Flusher.class);

  /**
   * @since 1.5
   */
  private Flusher() {}

  public static void flush(final Flushable... targets) {
    if (targets == null) {
      return;
    }

    for (Flushable target : targets) {
      if (target != null) {
        log.trace("Flushing: {}", target);
        try {
          target.flush();
        }
        catch (IOException e) {
          UnhandledThrowable.onFailure(e);
        }
      }
    }
  }
}