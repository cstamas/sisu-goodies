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
package org.sonatype.sisu.goodies.eventbus.internal;

import org.sonatype.sisu.litmus.testsupport.TestSupport;

import com.google.common.eventbus.Subscribe;
import com.google.common.eventbus.ThrowingGuavaEventBus;
import org.junit.Test;

/**
 * Tests for {@link ThrowingGuavaEventBus}.
 */
@SuppressWarnings("HardCodedStringLiteral")
public class ThrowingGuavaEventBusTest
    extends TestSupport
{
  @Test(expected = TestException.class)
  public void testHandlerThrowsException() {
    ThrowingGuavaEventBus bus = new ThrowingGuavaEventBus();
    bus.register(this);
    bus.post(new ThrowExceptionEvent(new TestException()));
  }

  public static class TestException
      extends RuntimeException
  {
    // ignore
  }

  public static class ThrowExceptionEvent
  {
    private Exception cause;

    public ThrowExceptionEvent(Exception cause) {
      this.cause = cause;
    }
  }

  @Subscribe
  public void handle(ThrowExceptionEvent event) throws Exception {
    log(event);
    throw event.cause;
  }
}