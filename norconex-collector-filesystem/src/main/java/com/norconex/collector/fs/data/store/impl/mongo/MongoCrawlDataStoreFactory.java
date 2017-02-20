/* Copyright 2013-2017 Norconex Inc.
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
package com.norconex.collector.fs.data.store.impl.mongo;

import com.norconex.collector.core.data.store.ICrawlDataStoreFactory;
import com.norconex.collector.core.data.store.impl.mongo.AbstractMongoCrawlDataStoreFactory;
import com.norconex.collector.core.data.store.impl.mongo.BaseMongoSerializer;
import com.norconex.collector.core.data.store.impl.mongo.IMongoSerializer;

/**
 * <p>Mongo implementation of {@link ICrawlDataStoreFactory}.</p>
 * <h3>XML configuration usage:</h3>
 * <pre>
 *  &lt;crawlDataStoreFactory  
 *      class="com.norconex.collector.fs.data.store.impl.mongo.MongoCrawlDataStoreFactory"&gt;
 *      &lt;host&gt;(Optional Mongo server hostname. Default to localhost)&lt;/host&gt;
 *      &lt;port&gt;(Optional Mongo port. Default to 27017)&lt;/port&gt;
 *      &lt;dbname&gt;(Optional Mongo database name. Default to crawl id)&lt;/dbname&gt;
 *      &lt;username&gt;(Optional user name)&lt;/username&gt;
 *      &lt;password&gt;(Optional user password)&lt;/password&gt;
 *  &lt;/crawlDataStoreFactory&gt;
 * </pre>
 * <p>
 * If "username" is not provided, no authentication will be attempted. 
 * The "username" must be a valid user that has the "readWrite" role over 
 * the database (set with "dbname").
 * </p>
 * <h4>Usage example:</h4>
 * <p>
 * The following points to a Mongo installation with host name "localhost",
 * port 1234, and a Mongo database called "MyCrawl".
 * </p>
 * <pre>
 *  &lt;crawlDataStoreFactory  
 *      class="com.norconex.collector.fs.data.store.impl.mongo.MongoCrawlDataStoreFactory"&gt;
 *      &lt;host&gt;localhost&lt;/host&gt;
 *      &lt;port&gt;1234&lt;/port&gt;
 *      &lt;dbname&gt;MyCrawl&lt;/dbname&gt;
 *  &lt;/crawlDataStoreFactory&gt;
 * </pre> 
 * @author Pascal Essiembre
 */
public class MongoCrawlDataStoreFactory 
        extends AbstractMongoCrawlDataStoreFactory {

    @Override
    protected IMongoSerializer createMongoSerializer() {
        return new BaseMongoSerializer();
    }
    
}
