require 'spec_helper'
require 'json'

describe 'IngestApi' do
  before do
    @api_instance = FeverClient::IngestApi.new
  end

  after do
  end

  describe 'test an instance of IngestApi' do
    it 'should create an instance of IngestApi' do
      expect(@api_instance).to be_instance_of(FeverClient::IngestApi)
    end
  end

  describe 'ingest_media test' do
    it 'should work' do
    end
  end

end
