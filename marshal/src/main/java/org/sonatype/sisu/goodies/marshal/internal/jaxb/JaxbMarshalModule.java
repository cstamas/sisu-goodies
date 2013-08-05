/*
 * Copyright (c) 2007-2012 Sonatype, Inc. All rights reserved.
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

package org.sonatype.sisu.goodies.marshal.internal.jaxb;

import javax.inject.Singleton;

import org.sonatype.sisu.goodies.marshal.Marshaller;

import com.google.inject.AbstractModule;

/**
 * <a href="http://jaxb.java.net/">JAXB</a> marshaling Guice module.
 *
 * @since 1.0
 */
public class JaxbMarshalModule
    extends AbstractModule
{
  @Override
  protected void configure() {
    bind(JaxbComponentFactory.class).to(JaxbComponentFactoryImpl.class).in(Singleton.class);
    bind(Marshaller.class).to(JaxbMarshaller.class).in(Singleton.class);
    //bind(Marshaller.class).annotatedWith(named("jaxb")).to(JaxbMarshaller.class).in(Singleton.class);
  }
}
