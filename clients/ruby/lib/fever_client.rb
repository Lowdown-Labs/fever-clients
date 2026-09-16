require 'fever_client/api_client'
require 'fever_client/api_error'
require 'fever_client/api_model_base'
require 'fever_client/version'
require 'fever_client/configuration'

require 'fever_client/models/api_key'
require 'fever_client/models/corpus_stats'
require 'fever_client/models/corpus_tag'
require 'fever_client/models/create_key_request'
require 'fever_client/models/duplicate_cluster'
require 'fever_client/models/duplicates_request'
require 'fever_client/models/duplicates_response'
require 'fever_client/models/export_request'
require 'fever_client/models/export_result'
require 'fever_client/models/http_validation_error'
require 'fever_client/models/health'
require 'fever_client/models/import_request'
require 'fever_client/models/import_result'
require 'fever_client/models/ingest_media'
require 'fever_client/models/ingest_request'
require 'fever_client/models/ingest_result'
require 'fever_client/models/ingest_source'
require 'fever_client/models/ingested_media'
require 'fever_client/models/job'
require 'fever_client/models/key_reveal'
require 'fever_client/models/location_inner'
require 'fever_client/models/media_formats'
require 'fever_client/models/media_frame'
require 'fever_client/models/media_info'
require 'fever_client/models/media_span'
require 'fever_client/models/query_request'
require 'fever_client/models/query_result'
require 'fever_client/models/search_hit'
require 'fever_client/models/search_request'
require 'fever_client/models/transcript_segment'
require 'fever_client/models/validation_error'

require 'fever_client/api/auth_api'
require 'fever_client/api/corpus_api'
require 'fever_client/api/customers_api'
require 'fever_client/api/default_api'
require 'fever_client/api/duplicates_api'
require 'fever_client/api/export_api'
require 'fever_client/api/ingest_api'
require 'fever_client/api/jobs_api'
require 'fever_client/api/keys_api'
require 'fever_client/api/media_api'
require 'fever_client/api/query_api'
require 'fever_client/api/search_api'

module FeverClient
  class << self
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end
